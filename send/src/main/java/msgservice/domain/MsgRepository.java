package msgservice.domain;

import msgservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "msgs", path = "msgs")
public interface MsgRepository extends PagingAndSortingRepository<Msg, Long> {}
