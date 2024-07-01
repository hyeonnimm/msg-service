package msgservice.domain;

import msgservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "stats", path = "stats")
public interface StatRepository
    extends PagingAndSortingRepository<Stat, Long> {}
