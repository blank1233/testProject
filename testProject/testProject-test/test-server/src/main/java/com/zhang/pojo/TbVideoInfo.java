package com.zhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbVideoInfo {

    private Integer id;

    private Integer videoId;

    private Integer author;

    private String tag;

    private Integer duration;

    private String releaseTime;
}
