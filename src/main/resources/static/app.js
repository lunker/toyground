

const React = require('react');
const ReactDOM = require('react-dom');

class ShoppingList extends React.Component {
    render() {
        return (
            <div className="shopping-list">
                <h1>Shopping List for {this.props.name}</h1>
                <ul>
                    <li>Instagram222222</li>
                    <li>WhatsApp222</li>
                </ul>
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
        return (<ShoppingList/>)
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('app')
)

