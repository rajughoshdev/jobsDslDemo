10.times {
freeStyleJob ('hello' + it){
  scm {
  	github('rajughoshdev/fpm','master')
  }
  steps {
  	shell ("echo 'hello world'; ")
  }
}

}
