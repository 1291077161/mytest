package com.yomahub.liteflow.service.impl;


// @Service
// public class UserSettingServiceImpl extends ServiceImpl<UserSettingMapper, UserSetting> implements UserSettingService {
//     @Autowired
//     private UserSettingMapper userSettingMapper;
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int saveOrUpdateUserSetting(UserSettingDTO userSettingDTO) {
//         UserSetting userSetting = new UserSetting();
//         userSetting.setColumn(userSettingDTO.getColumn().toJSONString());
//         userSetting.setUserId(userSettingDTO.getUserId());
//         userSetting.setCode(userSettingDTO.getCode());
//         userSetting.setTenantId("111111");
//         LambdaQueryWrapper<UserSetting> lqw = new LambdaQueryWrapper<>(userSetting);
//         lqw.eq(Objects.nonNull(userSettingDTO.getCode()), UserSetting::getCode, userSettingDTO.getCode());
//         lqw.eq(Objects.nonNull(userSettingDTO.getUserId()), UserSetting::getUserId, userSettingDTO.getUserId());
//
//         int row;
//         if (Objects.nonNull(userSettingMapper.selectOne(lqw))) {
//             row = userSettingMapper.update(userSetting, lqw);
//         }
//         row = userSettingMapper.insert(userSetting);
//         return row;
//     }
//
//
//     @Override
//     public UserSettingDTO findByUserIdAndPageCode(UserSetting userSetting) {
//         LambdaQueryWrapper<UserSetting> lqw = new LambdaQueryWrapper<UserSetting>();
//         lqw.eq(Objects.nonNull(userSetting.getUserId()), UserSetting::getUserId, userSetting.getUserId());
//         lqw.eq(Objects.nonNull(userSetting.getCode()), UserSetting::getCode, userSetting.getCode());
//         UserSetting user = userSettingMapper.selectOne(lqw);
//         UserSettingDTO userSettingDTO = new UserSettingDTO();
//         userSettingDTO.setCode(user.getCode());
//         userSettingDTO.setColumn(JSONArray.parseArray(user.getColumn()));
//         userSettingDTO.setUserId(user.getUserId());
//         return userSettingDTO;
//     }
// }
