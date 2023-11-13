package murilo.santos.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import murilo.santos.model.Fruit;
import murilo.santos.service.FruitService;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/fruits")
public class FruitsResource {

    @Inject
    FruitService fruitService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> listFruits() {
        return fruitService.listFruits();
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void insertFruit(){
        fruitService.insertFruit();
    }

    @GET
    @Path("/{id}")
    public void updateFruit(@PathParam("id") Long id){


    }

}
