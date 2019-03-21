package common.pojo.common_account;

import java.io.Serializable;
import java.util.Date;

public class AttrFile implements Serializable {
    private Integer fileId;

    private String fileuuid;

    private String filePosition;

    private String fileUrl;

    private Date fileCreateTime;

    private String fileHash;

    private Integer fileSize;

    private Integer fileType;

    private String fileCover;

    private String fileAbsoluteUrl;

    private String fileExt;

    private String fileMsg;

    private static final long serialVersionUID = 1L;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileuuid() {
        return fileuuid;
    }

    public void setFileuuid(String fileuuid) {
        this.fileuuid = fileuuid == null ? null : fileuuid.trim();
    }

    public String getFilePosition() {
        return filePosition;
    }

    public void setFilePosition(String filePosition) {
        this.filePosition = filePosition == null ? null : filePosition.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getFileCreateTime() {
        return fileCreateTime;
    }

    public void setFileCreateTime(Date fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash == null ? null : fileHash.trim();
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getFileCover() {
        return fileCover;
    }

    public void setFileCover(String fileCover) {
        this.fileCover = fileCover == null ? null : fileCover.trim();
    }

    public String getFileAbsoluteUrl() {
        return fileAbsoluteUrl;
    }

    public void setFileAbsoluteUrl(String fileAbsoluteUrl) {
        this.fileAbsoluteUrl = fileAbsoluteUrl == null ? null : fileAbsoluteUrl.trim();
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    public String getFileMsg() {
        return fileMsg;
    }

    public void setFileMsg(String fileMsg) {
        this.fileMsg = fileMsg == null ? null : fileMsg.trim();
    }
}