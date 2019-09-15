package com.soft.web;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.entity.TblUser;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

public class UploadAction extends ActionSupport {
    //得到上传的文件
    private File uploadImage;
    //得到文件的类型 (命名：文件属性名+ContentType)
    private String uploadImageContentType;
    //得到文件的名称(命名：文件属性名+FileName)
    private String uploadImageFileName;
    private TblUser user;

    @Override
    public String execute() {
        System.out.println("fileName:" + this.getUploadImageFileName());
        System.out.println("contentType:" + this.getUploadImageContentType());
        System.out.println("File:" + this.getUploadImage());
        System.out.println("用户名"+user.getUname());
        //获取要保存文件夹的物理路径(绝对路径)
        String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
        File file = new File(realPath);
        //测试此抽象路径名表示的文件或目录是否存在。若不存在，创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
        if (!file.exists()) {
            file.mkdirs();
        }
        try {   //保存文件
            FileUtils.copyFile(uploadImage, new File(file, uploadImageFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public File getUploadImage() {
        return uploadImage;
    }

    public void setUploadImage(File uploadImage) {
        this.uploadImage = uploadImage;
    }

    public String getUploadImageContentType() {
        return uploadImageContentType;
    }

    public void setUploadImageContentType(String uploadImageContentType) {
        this.uploadImageContentType = uploadImageContentType;
    }

    public String getUploadImageFileName() {
        return uploadImageFileName;
    }

    public void setUploadImageFileName(String uploadImageFileName) {
        this.uploadImageFileName = uploadImageFileName;
    }

    public TblUser getUser() {
        return user;
    }

    public void setUser(TblUser user) {
        this.user = user;
    }
}
