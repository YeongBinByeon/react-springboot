package org.zerock.apiserver.dto;

import lombok.Builder;


public class PageRequestDTO {

    @Builder.Default
    private int page = 1;

    @Builder.Default
    private int size = 10;
}
