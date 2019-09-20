package br.com.luizcarlospjr.springbootthymeleaf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VendorDto {

    @NotNull
    @NotEmpty
    @Size(min = 6, max = 6)
    private String vendorCde;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String vendorName;

}