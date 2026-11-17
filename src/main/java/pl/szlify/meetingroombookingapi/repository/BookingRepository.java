package pl.szlify.meetingroombookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.szlify.meetingroombookingapi.model.Booking;

import java.time.LocalDateTime;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("""
    select count(b) > 0 from Booking b
    where b.room.id = :roomId
    and b.status = 'CONFIRMED'
    and b.startTime < :endTime
    and b.endTime > :startTime
""")
    boolean existsOverlappingBooking(Long roomId, LocalDateTime startTime, LocalDateTime endTime);
}
