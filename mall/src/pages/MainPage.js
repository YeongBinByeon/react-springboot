import React from 'react';
import { Link } from 'react-router-dom';
import BasicLayout from "../layouts/BasicLayout"

function MainPage(props){
    return (

        <BasicLayout>
            <div className={'text-3xl'}>Main Page</div>
        </BasicLayout>

    );
}

export default MainPage;