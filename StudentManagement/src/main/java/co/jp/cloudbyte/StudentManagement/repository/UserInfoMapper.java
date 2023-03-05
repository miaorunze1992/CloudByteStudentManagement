package co.jp.cloudbyte.StudentManagement.repository;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    void insertUserInfo(RegisterForm registerForm);
    List<UserInfo> selectAll();

    List<UserInfo> selectByCondition(@Param("Country") String country,@Param("Gender") String gender);

    UserInfo selectByUsername(@Param("Username") String username);

    void updateUserInfo(RegisterForm registerForm);

    void deleteUserInfo(String username);
}
