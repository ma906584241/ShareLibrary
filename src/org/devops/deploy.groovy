package org.devops
//saltstack
def saltdeploy(hosts,func){
  sh "salt \'$hosts\' cmd.run \'${func}\'"
}

//ansible
def ansibledeploy(hosts,func){
  sh "ansible ${hosts} -m command -a \'${func}\'"
}
