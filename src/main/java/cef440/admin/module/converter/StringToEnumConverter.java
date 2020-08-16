package cef440.admin.module.converter;

import org.springframework.core.convert.converter.Converter;

import com.admin.module.model.user.UserRole;

public class StringToEnumConverter implements Converter<String, UserRole> {
    @Override
    public UserRole convert(String source) {
        try {
            return UserRole.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}