package guru.sfg.brewery.model.events;

import guru.sfg.beer.order.service.domain.BeerOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderRequest {
    private BeerOrder beerOrder;
}
