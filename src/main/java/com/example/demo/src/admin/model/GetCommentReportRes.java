package com.example.demo.src.admin.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class GetCommentReportRes {
    private Long reportId;
    private String userName;
    private Long commentId;
    private String comment;
    private String cause;
    private Date createdDate;
}
