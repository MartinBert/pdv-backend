package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CommercialBranch;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialBranchDao extends PagingAndSortingRepository<CommercialBranch, Long> {
}
