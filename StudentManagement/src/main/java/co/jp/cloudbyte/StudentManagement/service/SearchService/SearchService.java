package co.jp.cloudbyte.StudentManagement.service.SearchService;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;

import java.util.List;

public interface SearchService {

    List<UserInfo> searchALl();

    List<UserInfo> searchByCondition(String country, String gender);
}
