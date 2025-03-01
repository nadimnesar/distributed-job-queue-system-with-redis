package com.nadimnesar.jobqueue.dto.request;

import com.nadimnesar.jobqueue.constant.enums.JobPriority;
import com.nadimnesar.jobqueue.constant.enums.JobType;
import lombok.Data;

@Data
public class JobRequest {
    private JobType type;
    private JobPriority priority;
    private String payload;
    private Long maxRetryAttemptCount;
}
