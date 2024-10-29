package com.example.entity;

public class Params {
        private String name;
        private String number;
        private Integer pageNum;
        private Integer pageSize;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public Integer getPageNum() {
                return pageNum;
        }

        public void setPageNum(Integer pageNum) {
                this.pageNum = pageNum;
        }

        public Integer getPageSize() {
                return pageSize;
        }

        public void setPageSize(Integer pageSize) {
                this.pageSize = pageSize;
        }
}
