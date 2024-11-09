import logo from './logo.svg';
import './App.css';
import React,{Component} from 'react';
import {getAllStudent} from './clieyarnnt';

class App extends Component{

  state = {
    students: []
  }
  componentDidMount(){
    this.fetchStudents();
  }
  fetchStudents = () =>{
    getAllStudent()
    .then(res => res.json()
    .then(student =>{
      console.log(student);
      this.setState({
        student
      });
  }));
}
  render(){
    return <h1>Hello world SpringBoot & React</h1>
    
  }
  
}

export default App;
