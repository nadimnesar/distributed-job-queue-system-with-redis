package com.nadimnesar.jobqueue.dto.response;

import com.nadimnesar.jobqueue.constant.enums.JobPriority;
import com.nadimnesar.jobqueue.constant.enums.JobStatus;
import com.nadimnesar.jobqueue.constant.enums.JobType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobResponse {
    private Long id;
    private JobPriority priority;
    private JobStatus status;
    private JobType type;
    private Double currentProgress;
    private String result;
    private String errorMessage;
}
