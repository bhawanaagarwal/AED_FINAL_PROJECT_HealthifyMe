/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.GymInstructor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class GymOrganization extends Organization {
    public GymOrganization() {
        super(Organization.Type.Gym.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GymInstructor());
        return roles;
    }
}