/**
 * Created by voiceloco on 2018. 1. 23..
 */
const React = require('react');
const ReactDOM = require('react-dom');


class Header extends React.Component{

    constructor(props){
        super(props);
    }

    render(){
        return(
            <div>
                <ul>
                    <li>header1</li>
                    <li>header1</li>
                    <li>header1</li>
                    <li>header1</li>
                </ul>
            </div>

        );
    }
}


ReactDOM.render(
    <Header />,
    document.getElementById('header')
)
