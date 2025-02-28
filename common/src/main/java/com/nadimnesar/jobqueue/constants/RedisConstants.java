package com.nadimnesar.jobqueue.constants;

public class RedisConstants {
    public static final String JOB_QUEUE_PREFIX = "job:queue:";
    public static final String JOB_HASH_PREFIX = "job:";
    public static final String JOB_RESULT_PREFIX = "job:result:";
    public static final String JOB_DEAD_LETTER_QUEUE = "job:deadletter";
    public static final String JOB_PROCESSING_SET = "job:processing";
    public static final String JOB_DEPENDENCY_PREFIX = "job:dependency:";
}
