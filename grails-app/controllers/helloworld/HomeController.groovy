package helloworld

import com.test.HomeService
import com.test.co.UserCO
import com.test.dto.UserDTO

class HomeController {

    HomeService homeService

   // static allowedMethods = [index: 'GET',saveData: 'POST']

    def index() {
        String name = homeService.serviceMethod()
        render(view: 'index', model: [name: name, age: 10])
    }

    def testMe() {
        List list = ["Cat", "Bat", "Rat", "Mouse", "Dog"]
        println("-0000 ${params.name}")
        render(view: 'fisrtPage', model: [listOfAnimal: list])
    }

    def actionName() {
    }

    def saveData(){
        homeService.saveUserData()
        render("done")
    }

    def userDataSave(UserCO userCO){
        homeService.saveUserData(userCO)
        render("done")
    }

    def userData(int id){
        UserDTO userDTO = homeService.getUserById(id)
        render(view: 'user',model: [user:userDTO])
    }

    def getDataByName(String lastName){
        UserDTO userDTO = homeService.getUserByName(lastName)
        render(view: 'user',model: [user:userDTO])
    }

    def gitaction(){
        render "Hello from git"
    }
}
