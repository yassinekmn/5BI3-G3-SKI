package com.example.p5bi3g3ski.repositories;



import com.example.p5bi3g3ski.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISkierRepository extends JpaRepository<Skier, Long> {
   List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);
   Skier findBySubscription(Subscription subscription);


}
