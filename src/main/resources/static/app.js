const React = require('react');
const ReactDOM = require('react-dom');
const Project = require('./component/project');
const Bootstrap = require('react-bootstrap');
const Button = require('react-bootstrap').Button;
const ButtonToolBar = require('react-bootstrap').ButtonToolBar;

class ShoppingList extends React.Component {
    render() {
        return (
            <div className="shopping-list">
                <h1>Shopping List for {this.props.name}</h1>
                <ul>
                    <li>Instagram222222</li>
                    <li>WhatsApp222</li>
                </ul>
                <Project/>
            </div>
        );
    }
}

class Buttons extends React.Component {

    constructor(props) {
        super(props);
        // this.state = {employees: []};
    }

    render() {
        return (
            <div>
                <Button bsStyle="primary" bsSize="large">Default</Button>
            </div>
        );
    }
}

class App extends React.Component {

    constructor(props) {
        super(props);
        // this.state = {employees: []};
    }

    /*
    componentDidMount() {
        client({method: 'GET', path: '/api/employees'}).done(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    }
    */

    render() {
        return (
            <div>
                {/*<ShoppingList/>*/}
                {/*<Buttons/>*/}
                hi!
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('app')
)