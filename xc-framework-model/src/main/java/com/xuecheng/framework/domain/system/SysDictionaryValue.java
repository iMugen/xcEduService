package com.xuecheng.framework.domain.system;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Daniel Liu 2020/4/28 10:35
 */
@Data
@ToString
public class SysDictionaryValue {
    @Field("sd_name")
    private String sdName;
    @Field("sd_id")
    private String sdId;
    @Field("sd_status")
    private String sdStatus;
}