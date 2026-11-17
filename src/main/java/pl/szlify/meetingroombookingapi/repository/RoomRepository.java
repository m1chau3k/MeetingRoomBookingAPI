package pl.szlify.meetingroombookingapi.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import pl.szlify.meetingroombookingapi.model.Room;

public interface RoomRepository extends JpaRepositoryImplementation<Room, Long> {
}
