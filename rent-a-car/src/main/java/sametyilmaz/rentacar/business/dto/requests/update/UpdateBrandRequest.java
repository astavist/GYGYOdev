package sametyilmaz.rentacar.business.dto.requests.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateBrandRequest {
    private int id;
    private String name;
}
