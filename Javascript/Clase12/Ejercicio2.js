function createTaskManager() {

    let tasks = [];
    let idCounter = 1; //Agrego un contador para asignar un id a cada tarea

    

    return {

        addTask: function(task) {
            // Creo un diccionario que contendra el id, la tarea y si esta completa o no
            const newTask = {
                id: idCounter++,
                taskName: task,
                completed: false
            };
            // Meto la tarea dentro de la lista principal y muestro en pantalla
            tasks.push(newTask);
            console.log("Se agrego la tarea: " + task);
        },

        completeTask: function(taskId) {

            let task = tasks.find(task => task.id === taskId); //Busco dentro de la lista principal el id de una tarea
            // Este if ya que al encontrar la tarea por el id, task devuelve true en un if statement, si no encuentra nada devuelve false
            if (task) {
                task.completed = true;
                console.log("Se completo la tarea: " + task.taskName)
            } else {
                console.log("No existe una tarea con el id: " + taskId);
            }
            
        },

        listTasks: function() {

            console.log("Aqui esta tu lista de tareas:");
            //Muestro cada tarea por separado con un forEach
            tasks.forEach(t => {
                console.log("Id: " + t.id + "\n" + "Tarea: " + t.taskName + "\n" + "¿Tarea completada?: " + (t.completed ? "Si" : "No") )
            });

        }

    };

}



// Uso:

const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");

myTasks.addTask("Hacer ejercicio");

myTasks.completeTask(2) //Completo la segunda tarea

myTasks.listTasks() //Muestro en pantalla cada tarea, en la segunda tarea se va a ver que esta completada