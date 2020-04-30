package ua.i.mail100.model;

import org.springframework.web.multipart.MultipartFile;

public class Franchise extends BaseEntity {
    private String name;
    private String path;
    private MultipartFile file;

    public Franchise(Integer id, String name, String path, MultipartFile file,
                        Long createDate, Long modifyDate, String recordStatus) {
        super(id, createDate, modifyDate, recordStatus);
        this.name = name;
        this.path = path;
        this.file = file;
    }
}
