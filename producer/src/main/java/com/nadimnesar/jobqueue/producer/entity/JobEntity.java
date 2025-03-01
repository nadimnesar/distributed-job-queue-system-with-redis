package com.nadimnesar.jobqueue.producer.entity;

import com.nadimnesar.jobqueue.constant.enums.JobPriority;
import com.nadimnesar.jobqueue.constant.enums.JobStatus;
import com.nadimnesar.jobqueue.constant.enums.JobType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private JobPriority priority;
    private JobStatus status;
    private JobType type;

    private String payload;
    private String result;
    private String errorMessage;

    private Double currentProgress;
    private Long currentRetryAttemptCount;
    private Long maxRetryAttemptCount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
}
