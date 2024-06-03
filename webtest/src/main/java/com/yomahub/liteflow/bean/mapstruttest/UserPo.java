package com.yomahub.liteflow.bean.mapstruttest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
// @Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserPo {
    private Long id;
    private Date gmtCreate;
    private Date createTime;
    private Long buyerId;
    private Long age;
    private String userNick;
    private String userVerified;
}
