package com.nadimnesar.jobqueue.producer.service;

import com.nadimnesar.jobqueue.dto.request.JobRequest;
import com.nadimnesar.jobqueue.dto.response.JobResponse;

import java.util.List;

public interface JobService {
    String submitJob(JobRequest jobRequest);

    List<JobResponse> getAllJobs();
}
