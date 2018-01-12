/**
 * Created by voiceloco on 2018. 1. 11..
 */

import { shallow, mount, render } from 'enzyme';

it('first test case', () => {

    var header = shallow(
        <h5>asdfasdf</h5>
    );

    expect(header).toMatchSnapshot();
});
