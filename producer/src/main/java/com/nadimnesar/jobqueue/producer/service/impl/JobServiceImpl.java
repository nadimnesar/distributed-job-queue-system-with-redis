package com.nadimnesar.jobqueue.producer.service.impl;

import com.nadimnesar.jobqueue.dto.request.JobRequest;
import com.nadimnesar.jobqueue.dto.response.JobResponse;
import com.nadimnesar.jobqueue.producer.entity.JobEntity;
import com.nadimnesar.jobqueue.producer.repository.JobRepository;
import com.nadimnesar.jobqueue.producer.service.JobService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JobServiceImpl implements JobService {
    private static final Logger logger = LoggerFactory.getLogger(JobServiceImpl.class);

    private final JobRepository jobRepository;

    public String submitJob(JobRequest jobRequest) {
        logger.info("Submitting job {}", jobRequest);

        JobEntity jobEntity = JobEntity.builder()
                .type(jobRequest.getType())
                .priority(jobRequest.getPriority())
                .payload(jobRequest.getPayload())
                .maxRetryAttemptCount(jobRequest.getMaxRetryAttemptCount())
                .build();

        jobRepository.save(jobEntity);

        return "Success";
    }

    public List<JobResponse> getAllJobs() {
        logger.info("Getting all jobs");

        List<JobEntity> jobEntityEntities = jobRepository.findAll();
        return jobEntityEntities.stream()
                .map(entity -> JobResponse.builder()
                        .id(entity.getId())
                        .priority(entity.getPriority())
                        .status(entity.getStatus())
                        .type(entity.getType())
                        .currentProgress(entity.getCurrentProgress())
                        .errorMessage(entity.getErrorMessage())
                        .result(entity.getResult())
                        .build())
                .collect(Collectors.toList());
    }
}
