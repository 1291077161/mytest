package com.yomahub.liteflow.bean.mapstruttest;


public class MapStructTest {
    public static void main(String[] args) {
        testNormal();
    }

    public static void testNormal() {
        System.out.println("-----------testNormal-----start------");

        UserPo userPo = new UserPo();
        UserPo userPo1 = userPo.setId(1L);
        // UserPo userPo = UserPo.builder()
        //         .id(1L)
        //         .gmtCreate(new Date())
        //         .buyerId(666L)
        //         .userNick("测试mapstruct")
        //         .userVerified("ok")
        //         .age(18L)
        //         .build();
        System.out.println("1234" + userPo);
        UserEntity userEntity = IPersonMapper.INSTANCT.po2entity(userPo);
        System.out.println(userEntity);
        System.out.println("-----------testNormal-----ent------");
    }
}
