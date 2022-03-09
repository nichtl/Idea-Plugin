package com.nicht.fishbook.service;

import java.util.List;


public interface BookScanner {
     String bookName();
     long getBookSize();
     long getTotalLines();
     List<String> getContentForPage(int page, int pageSize);
}
