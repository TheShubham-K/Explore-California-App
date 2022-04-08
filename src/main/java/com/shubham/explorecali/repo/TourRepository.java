package com.shubham.explorecali.repo;

import com.shubham.explorecali.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {



}
