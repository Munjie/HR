package com.mwj.bean;

public class Admin {
    private String adminname;

    private String adminpwd;

    private Integer adminlevel;

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public Integer getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(Integer adminlevel) {
        this.adminlevel = adminlevel;
    }
}