package az.autobazar.service;


import az.autobazar.domain.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    List<Brand> getBrands();
    Optional<Brand> getBrandById(long id);
}
