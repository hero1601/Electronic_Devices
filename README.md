# Electronic_Devices

## Database

Created a database with the name of electronic_devices and added 3 tables


    * category
    * product
    * product_Variant

## Backend

Written a spring boot application with the api's as follows

### For CategoryService

   * GET,POST,PUT "/category"
   * GET,DELETE   "/category/{id}"

### For ProductService

   * GET "/product/{id}"
   * GET "/product" request param as category_id which finds all product inside a specific category_id


### For ProductVariantService

   * GET "/product_variant" request param as product_id which finds all product_variant inside a product and returns a list sorted by price
   * GET "/product_variant/{sku}"


## Frontend

Written a kotlin application with retrofit as API interface


