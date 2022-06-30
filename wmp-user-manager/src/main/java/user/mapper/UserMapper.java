package user.mapper;

import user.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserInfo> {
}
