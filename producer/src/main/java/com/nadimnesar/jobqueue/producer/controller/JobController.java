package com.nadimnesar.jobqueue.producer.controller;

import com.nadimnesar.jobqueue.dto.request.JobRequest;
import com.nadimnesar.jobqueue.dto.response.JobResponse;
import com.nadimnesar.jobqueue.producer.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/job")
public class JobController {

    private final JobService jobService;

    @PostMapping("/create")
    public ResponseEntity<?> submitJob(@RequestBody JobRequest jobRequest) {
        var response = jobService.submitJob(jobRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/getAllJobs")
    public ResponseEntity<List<JobResponse>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }
}
