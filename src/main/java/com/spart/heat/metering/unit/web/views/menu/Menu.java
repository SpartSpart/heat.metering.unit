package com.spart.heat.metering.unit.web.views.menu;

import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.service.UserDetailsServiceImpl;
import com.spart.heat.metering.unit.service.model.UserDetailsImpl;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.menubar.MenuBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


public class Menu extends MenuBar {

    private int adminPermission=0;
    public static User curentUser;

   // private UserService userService;
   @Autowired
   private UserDetailsServiceImpl userDetailsService;

    public Menu(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;

        curentUser = getUser();

       // MenuItem unitInfo = addItem("UnitInfo");
        MenuItem administration = addItem("Настройки");
        MenuItem signOut = addItem("Выход, "+getUserName());


        adminPermission = getPermission();
        if (adminPermission==0)
            administration.setVisible(false);
        signOut.addClickListener(event -> signOut());
        administration.addClickListener(menuItemClickEvent -> adminView());
      //  unitInfo.addClickListener(menuItemClickEvent -> unitView());
    }

    private void signOut(){
        SecurityContextHolder.getContext().setAuthentication(null);
        getUI().ifPresent(ui -> ui.navigate("login"));
    }

    private void adminView(){
       getUI().ifPresent(ui -> ui.navigate("settings"));
    }

//    private void unitView(){
//        getUI().ifPresent(ui -> ui.navigate("unitinfo"));
//    }

    private String getUserName(){
//        Principal principal = (Principal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return principal.getLogin().toUpperCase();
        return curentUser.getLogin();
    }

    private int getPermission(){
        return curentUser.getPermission();
    }

    private User getUser(){
        UserDetails userDetails = userDetailsService.getCurrent();
        User currentUser = userDetailsService.getUser(userDetails.getUsername());
        return currentUser;
    }

}
