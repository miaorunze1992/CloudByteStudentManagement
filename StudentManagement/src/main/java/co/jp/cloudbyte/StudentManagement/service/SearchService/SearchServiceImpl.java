package co.jp.cloudbyte.StudentManagement.service.SearchService;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import co.jp.cloudbyte.StudentManagement.repository.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> searchALl() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> searchByCondition(String country, String gender) {

        return userInfoMapper.selectByCondition(country,gender);
    }
}
