package org.solent.com600.example.journeyplanner.model;

import java.util.List;
import javax.naming.AuthenticationException;

public interface ServiceFacade {

    public SysUser createUser(SysUser sysUser, String actingSysUserName) throws AuthenticationException;

    public void deleteUser(Long id, String actingSysUserName) throws AuthenticationException;

    public SysUser retrieveUser(Long id, String actingSysUserName) throws AuthenticationException;
    
    public SysUser retrieveByUserName(String username, String actingSysUserName) throws AuthenticationException;

    public List<SysUser> retrieveAllUsers(String actingSysUserName) throws AuthenticationException;

    public List<SysUser> retrieveLikeMatchingUsers(String surname, String firstname, String actingSysUserName) throws AuthenticationException;

    public SysUser updateUser(SysUser sysUser, String actingSysUserName) throws AuthenticationException;

    public void deleteAllUsers(String actingSysUserName) throws AuthenticationException;

    public SysUser getUserInfoByUserName(String userName, String actingSysUserName) throws AuthenticationException;

    public SysUser updateUserInfoByUserName(UserInfo updateUserInfo, String userName, String actingSysUserName) throws AuthenticationException;

    public void updatePasswordByUserName(String newPassword, String userName, String actingSysUserName) throws AuthenticationException;

    public Boolean getInsuranceVerified(String userName, String actingSysUserName) throws AuthenticationException;

    public void updateInsuranceVerified(Boolean insuranceVerified, String userName, String actingSysUserName) throws AuthenticationException;

    public void updateUserRoleByUserName(Role newRole, String userName, String actingSysUserName) throws AuthenticationException;

}
