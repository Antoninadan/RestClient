package ua.i.mail100.model;

public class BaseEntity {
    private Integer id;
    private Long createDate;
    private Long modifyDate;
    private String recordStatus;

    public BaseEntity(Integer id, Long createDate, Long modifyDate, String recordStatus) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.recordStatus = recordStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }
}