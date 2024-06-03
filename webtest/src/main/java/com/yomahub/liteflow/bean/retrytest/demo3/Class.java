package com.yomahub.liteflow.bean.retrytest.demo3;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 *
 * @author Joy
 * @date 2024/4/17
 * @param
 *
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Class {
	String name;

	String location;
}
