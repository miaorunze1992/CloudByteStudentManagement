package co.jp.cloudbyte.StudentManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfo {

    private String username;
    private String password;
    private Integer gender;
    private String address;
    private Integer country;
    private String comment;

}
