package helloworld

class DemoController {

    static defaultAction = "test"
    def test() {
        render("hi from Demo test")
    }

    def test2() {
        redirect(controller: 'home',action:'testMe', params: [name:"Arshad"])
    }
}
