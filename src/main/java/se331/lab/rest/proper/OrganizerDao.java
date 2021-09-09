package se331.lab.rest.proper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.Organizer;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
}
